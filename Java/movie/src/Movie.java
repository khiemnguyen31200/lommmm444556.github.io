public class Movie {
    long id;
    String title;
    String Category;
    String Language;
    int year;
    String Maker;
    int time;
    
    public long getId() {
        return id;
    }
    public Movie(long id, String title, String category, String language, int year, String maker, int time) {
        this.id = id;
        this.title = title;
        this.Category = category;
        this.Language = language;
        this.year = year;
        Maker = maker;
        this.time = time;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        this.Category = category;
    }
    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String language) {
        this.Language = language;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getMaker() {
        return Maker;
    }
    public void setMaker(String maker) {
        Maker = maker;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return id+ " - " +title+"-"+Category+"-"+Language+"-"+year+"-"+Maker+"-"+time;
    }
    

    
}
