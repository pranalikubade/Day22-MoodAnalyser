public class MoodAnalyser {
    public String analyseMood(String message){
        return message;
    }
    private String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyzeMessage() {
        try {
            String msg=message.toLowerCase();
            if (msg.contains("sad")) {
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch(NullPointerException exception) {
            return "HAPPY";
        }
    }
}
