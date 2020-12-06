public class Automat {
    public Pair<Boolean, Integer>isDigit(String line, Integer skip) {
        Boolean isDigit = false;
        Integer count = 0;

        for(int i = skip; i < line.length(); i++) {
            if(Character.isDigit(line.charAt(i))) {
                isDigit = true;
                count++;
            }
            else
            {
                break;
            }
        }

        return new Pair<Boolean, Integer>(isDigit, count);
    }
}
