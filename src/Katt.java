public class Katt extends Djur {
    private String ras;

    public Katt(String name, int agee, String rass) {
        super();
        namn = name;
        age = agee;
        ras = rass;
    }

    public void alder () {
        if (age >100) {
            System.out.println("Yumyum är död eftersom han är 100+ år");

        }
        else {
            System.out.println("Yumyum chillar och är " + age +" år gammal");
        }
    }
        public void ljud () {
            System.out.println(namn +"mjauar");

        }
        public void kattsaker () {
        System.out.println(namn + "gör kattsaker");
        }

        public void introduktion (Katt katt) {
        System.out.println("Denna katt heter :" + katt.namn);
            System.out.println(namn + "är " +age + " år gammal och är utav rasen " + ras );


        }
}
