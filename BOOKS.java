public class BOOKS {
    //BOOKS Objects
    private String type;
    private String genre;
    private String title;
    private int borrowtime;

    //BOOKS Constructor
    public BOOKS(String type, String genre, String title, int borrowtime){
        this.type = type;
        this.genre = genre;
        this.title = title;
        this.borrowtime = borrowtime;
    }

    //BOOKS returning of inputs
    public String gettype(){
        return type;
    }

    public String getgenre(){
        return genre;
    }

    public String gettitle(){
        return title;
    }
   

}
