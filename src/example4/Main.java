package example4;


public class Main {

    public static void main(String[] args) {

        Poem[] poems = new Poem[3];
        Poem poem1 = new Poem(new Author("Agolli", "Shqiptar"), 8);


        //menyre tj
        /*Author author1 = new Author("Agolli","Shqiptar");
        Poem poem1 = new Poem(author1, 8);*/


        Poem poem2 = new Poem(new Author("Kadare", "Shqiptar"), 4);
        Poem poem3 = new Poem(new Author("Frasheri", "Shqiptar"), 7);

        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;


        String emriAutorit = getAuthorLongestPoem(poems) ;
        System.out.println(emriAutorit);

        }


    private static String getAuthorLongestPoem(Poem[] poems) {
        int strofaMeEGjate = poems[0].getStropheNumbers();
        int index = 0;

        for(int i=1; i<poems.length; i++){
            if(strofaMeEGjate<poems[i].getStropheNumbers()){
                strofaMeEGjate = poems[i].getStropheNumbers();
                index = i;
            }
        }

        String mbiemriAutorit = poems[index].getCreator().getSurname();
      return mbiemriAutorit;
    }
}





