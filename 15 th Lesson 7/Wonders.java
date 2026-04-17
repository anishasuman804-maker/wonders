public class Wonders {
    void location() {
        System.out.println("Location is: ");
    }

    void famousFor() {
        System.out.println("Famous for: ");
    }
}

class TajMahal extends Wonders {
    void location() {
        System.out.println("Taj Mahal is in India");
    }

    void famousFor() {
        System.out.println("It is famous for its white marble beauty and love story");
    }
}

class GreatWall extends Wonders {
    void location() {
        System.out.println("Great Wall is in China");
    }

    void famousFor() {
        System.out.println("It is famous for being the longest wall in the world");
    }
}

class Petra extends Wonders {
    void location() {
        System.out.println("Petra is in Jordan");
    }

    void famousFor() {
        System.out.println("It is famous for rock-cut architecture");
    }
}

class ChristRedeemer extends Wonders {
    void location() {
        System.out.println("Christ the Redeemer is in Brazil");
    }

    void famousFor() {
        System.out.println("It is famous for the giant statue of Jesus");
    }
}

class MachuPicchu extends Wonders {
    void location() {
        System.out.println("Machu Picchu is in Peru");
    }

    void famousFor() {
        System.out.println("It is famous for ancient Incan city");
    }
}

class ChichenItza extends Wonders {
    void location() {
        System.out.println("Chichen Itza is in Mexico");
    }

    void famousFor() {
        System.out.println("It is famous for Mayan pyramid");
    }
}

class Colosseum extends Wonders {
    void location() {
        System.out.println("Colosseum is in Italy");
    }

    void famousFor() {
        System.out.println("It is famous for ancient Roman gladiator arena");
    }
}

class Main {
    public static void main(String args[]) {
        Wonders W = new Wonders();
        Wonders T = new TajMahal();
        Wonders G = new GreatWall();
        Wonders P = new Petra();
        Wonders C = new ChristRedeemer();
        Wonders M = new MachuPicchu();
        Wonders Ch = new ChichenItza();
        Wonders Co = new Colosseum();

        W.location();
        W.famousFor();

        T.location();
        T.famousFor();

        G.location();
        G.famousFor();

        P.location();
        P.famousFor();

        C.location();
        C.famousFor();

        M.location();
        M.famousFor();

        Ch.location();
        Ch.famousFor();

        Co.location();
        Co.famousFor();
    }
} {
    
}
