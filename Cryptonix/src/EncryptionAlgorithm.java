public class EncryptionTool {
    private EncryptionAlgorithm encryptionAlgorithm;
    private KeyManagement keyManagement;
    private UserInterface userInterface;

    public EncryptionTool(EncryptionAlgorithm encryptionAlgorithm, KeyManagement keyManagement, UserInterface userInterface) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.keyManagement = keyManagement;
        this.userInterface = userInterface;
    }

    public String encryptData(String data, String key) {
        // Implement encryption logic using the chosen encryption algorithm and key management techniques
        String encryptedData = encryptionAlgorithm.encrypt(data, key);
        return encryptedData;
    }

    public String decryptData(String encryptedData, String key) {
        // Implement decryption logic using the chosen encryption algorithm and key management techniques
        String decryptedData = encryptionAlgorithm.decrypt(encryptedData, key);
        return decryptedData;
    }

    public void run() {
        // Implement the user interface logic to interact with the encryption tool
        userInterface.run();
    }

    // Example Usage
    public static void main(String[] args) {
        EncryptionAlgorithm encryptionAlgorithm = new AESAlgorithm();
        KeyManagement keyManagement = new KeyManagement();
        UserInterface userInterface = new UserInterface();

        EncryptionTool tool = new EncryptionTool(encryptionAlgorithm, keyManagement, userInterface);
        tool.run();
    }
}
