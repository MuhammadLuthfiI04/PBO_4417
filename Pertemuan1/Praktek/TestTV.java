public class TestTV {
    // ATTRIBUTE
    int channel; 
    int volumeLevel; 
    boolean on; 
    TestTV() { 
    }

    //METHOD
    void turnOn(boolean on){ // Kondisi TV Menyala
        on = true;
    }
    void turnOff(boolean on){ // Kondisi TV Mati
        on = false;
    }

    void setChannel(int newChannel){ // Set Channel pada TV
        channel = newChannel;
    }

    void setVolume(int newVolumeLevel){ // Set Volume pada TV
        volumeLevel = newVolumeLevel;
    }

    void channelUp(){ // Menambah atau menaikkan Channel
        ++channel;
    }

    void channelDown(){ // Mengurangi atau menurunkan Channel
        --channel;
    }

    void volumeUp(){ // Menambah atau menaikkan Volume
        ++volumeLevel;
    }

    void volumeDown(){ // Mengurangi atau menurunkan Volume
        --volumeLevel;
    }


    public static void main(String[] args) {
        TestTV tv1 = new TestTV();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);

        TestTV tv2 = new TestTV();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();

        System.out.println("Tv1's Channel is "+ tv1.channel +" and Volume level is " + tv1.volumeLevel );
        System.out.println("Tv2's Channel is "+ tv2.channel +" and Volume level is " + tv2.volumeLevel );
    }
}
