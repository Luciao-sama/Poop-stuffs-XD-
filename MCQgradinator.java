public class MCQgradinator {
    private String answersKey = "ebccadbaeecbbdeacdbe";
    
    public double getScore(String studentInput){
        double score = 0;
        for(int i=0;i<studentInput.length();i++){
            if(i<answersKey.length() && studentInput.charAt(i) == answersKey.charAt(i)){
                 score++;
            } 
         }
         return score;
    }
   
}