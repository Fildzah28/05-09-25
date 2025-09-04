public class PrisonTest {

 public static void main(String[] args) {
    Prisoner bubba = new Prisoner();
    bubba.name = "bubba";
    bubba.height = 2.08;
    bubba.sentence = 4;
    Prisoner twitch = new Prisoner();
    twitch.name = "twitch";
    twitch.height = 1.73;
    twitch.sentence = 3;

    System.out.println("Prisoner 1" + bubba.name+ "|" + bubba.height + "m" + bubba.sentence + "tahun" + "|Alamat memoris1 "+ bubba);
    System.out.println("Prisoner 2 " + twitch.name+ "|" + twitch.height + "m" + twitch.sentence + "tahun" + "|Alamat memoris1 "+twitch);

    System.out.println("Apakah bubba == twtch?");
    //samakan properti bubba agar sama dengan twitch
    bubba.name = "bubba";
    bubba.height = 2.08;
    bubba.sentence = 4;

    System.out.println("Apakah bubba == twitch setelah properti sama?" +(bubba == twitch));
    System.out.println();

    Prisoner bubba2 = new Prisoner();
    bubba2.name = "bubba";
    bubba2.height = 2.03;
    bubba2.sentence = 4;

    Prisoner twitch2 = new Prisoner();
    twitch2.name = "twitch";
    twitch2.height = 1.73;
    twitch2.sentence = 3;
    
    System.out.println("Apakah bubba2 sama dengan twitch2?");

    //ubah referensi bubba2 agar sama dengan twitch2
    bubba2 = twitch2;
    System.out.println("Apakah bubba2 == twitch2 setelah referesnsi? " +(bubba2==twitch2) );
    System.out.println("name bubba2 sekarang adalah" +bubba2.name); //twitch 

    //Camera 
    Camera remot1 = new Camera();
    Camera remot2 = new Camera();
    Camera remot3 = new Camera();
    
    remot.play1();
    remot.stop2();
    System.out.println();


    //Tv
    Camera remoteTv1 = new Camera();
    Camera remoteTv2 = new Camera();
    camare remoteTv3 = new camare();

    remoteTv1.play1();
    remoteTv2.stop2();
    System.out.println();

    remoteTv2.play1();
    remoteTv2.stop2();

    remoteTv3.play3();
    remoteTv3.stop3();
    System.out.println();

    //Tv
    Camera RemoteTv1 = new Camera();
    Camera RemoteTv2 = new Camera();
    Camera RemoteTv3 = new Camera();

    RemoteTv1.play1();
    remoteTv1.stop2();
    System.out.println();

    remoteTv2.play2();
    RemoteTv2.stop2();
    System.out.println();

    RemoteTv3.play2();
    RemoteTv3.stop2();
    System.out.println();
 }
 }
 