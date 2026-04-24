class dry{
    dry(int x)
    {
        System.out.println(x/2);
    }
    void lol(){
        System.out.println("lol");
    }
  
    public static void main(String[] args) {
        // do not repeat yourself
        dry obj = new dry(10);
        obj.lol();

    }
}