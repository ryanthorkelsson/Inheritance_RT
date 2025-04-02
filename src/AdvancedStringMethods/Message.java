package AdvancedStringMethods;

public class Message {
    private String machineType;
    private String machineId;
    private String warning;


    public Message(String text){
        int split = text.indexOf(":");
        String half = text.substring(0,split);
        warning = text.substring(split +1).trim();
        machineId = half.substring(half.length()-1);
        machineType = half.substring(0,half.length()-1);

    }


    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }



    public String toString() {
        return "Type: " + machineType + " | ID: " + machineId + " | Warning: " + warning;
    }

    public boolean scanWarning (String keyWord){
        int length = keyWord.length();
        String start = warning.substring(0,length) + " ";
        String end = " " + warning.substring(warning.length()-length);
        if(start.equals(keyWord + " ")){
            return true;
        }
        else if(end.equals(" " + keyWord)){
            return true;
        }
//        else if(){}
//        else if(){}


        return false;
    }
}



