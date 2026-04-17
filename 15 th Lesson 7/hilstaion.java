class Hillstations {
    void location() {
        System.out.println("Location is: ");
    }

    void famousFor() {
        System.out.println("Famous for: ");
    }
}

class Manali extends Hillstations {
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    void famousFor() {
        System.out.println("It is famous for Hadimba temple and adventure sports");
    }
}

class Mussoorie extends Hillstations {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousFor() {
        System.out.println("It is famous for education institutions");
    }
}

class Gulmarg extends Hillstations {
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    void famousFor() {
        System.out.println("It is famous for skiing");
    }
}

class Main {
    public static void main(String args[]) {
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations G = new Gulmarg();

        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();
    }
}
