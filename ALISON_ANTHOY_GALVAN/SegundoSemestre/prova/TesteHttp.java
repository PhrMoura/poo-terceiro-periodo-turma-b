package a;

import javax.swing.*;
import java.io.IOException;

public class TesteHttp {
    private static final String API_URL = "https://poo-exam.vercel.app/api/";

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Tipos de Pet", "Criar Mensagem para Pet", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    listPets();
                    break;
                case 1:
                    createPetMessage();
                    break;
                case 2:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void listPets() {
        try {
            String response = HttpRequest.sendGet(API_URL + "pets");
            JOptionPane.showMessageDialog(null, response);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na comunicação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void createPetMessage() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField imageUrlField = new JTextField();
        JTextField descriptionField = new JTextField();
        Object[] message = {
                "ID do Tipo de Pet:", idField,
                "Nome do Pet:", nameField,
                "URL da Foto do Pet:", imageUrlField,
                "Mensagem:", descriptionField,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Criar Mensagem para Pet", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String id = idField.getText();
            String name = nameField.getText();
            String imageUrl = imageUrlField.getText();
            String description = descriptionField.getText();
            String jsonInputString = String.format("{\"id\": \"%s\", \"name\": \"%s\", \"imageUrl\": \"%s\", \"description\": \"%s\"}", id, name, imageUrl, description);

            try {
                HttpRequest.sendPost(API_URL + "messages", jsonInputString);
                JOptionPane.showMessageDialog(null, "Mensagem criada com sucesso!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro na comunicação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
