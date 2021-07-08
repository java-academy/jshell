public class JsonConverter {

    private Gson gson;

    public JsonConverter(Gson gson) {
        this.gson = gson;
    }

    public void createFile(Questions questions, String name) throws IOException {
        String jsonQuestions = createJsonQuestions(questions);
        File file = new File(name);
        try(FileWriter writer = new FileWriter(file)){
            writer.write(jsonQuestions);
        }
    }

    public Questions readFromFile(File file) throws IOException {
        StringBuilder json = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = reader.readLine()) != null) {
                json.append(st);
            }
        }

        return gson.fromJson(json.toString(), Questions.class);
    }

    private String createJsonQuestions(Questions questions) {
        return gson.toJson(questions);
    }
}

