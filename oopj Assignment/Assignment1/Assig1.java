class Assig1{
    public static void main(String [] args){
        boolean bool = true;
        String str ="Bhushan";

        String str2 = Boolean.toString(bool);
        System.out.println("boolean value into String : "+str2);

        // boolean value into Boolean instance.
        boolean boolInst = Boolean.valueOf(bool);
        System.out.println("boolean value into Boolean instance : "+ boolInst);

        //String value into boolean value
        boolean strbool = Boolean.parseBoolean(str2);
        System.out.println("String value into boolean value : "+ strbool);

        //String value into Boolean instance.
        boolean strInst = Boolean.valueOf(str2);
        System.out.println("String value into Boolean instance : "+ strInst);
        









    }
}