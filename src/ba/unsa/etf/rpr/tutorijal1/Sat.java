package ba.unsa.etf.rpr.tutorijal1;

public class Sat {
        int sati,minute,sekunde;
        public Sat(int sati, int minute, int sekunde) { postavi(this.sati,this.minute,this.sekunde); }
        public void postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }
        public void sljedeci() {
            sekunde++;
            if (sekunde==60) { sekunde=0; minute++; }
            if (minute==60) { minute=0; sati++; }
            if (sati==24) sati=0;
        }
        public void Prethodni() {
            sekunde--;
            if (sekunde==-1) { sekunde=59; minute--; }
            if (minute==-1) { minute=59; sati--; }
            if (sati==-1) sati=23;
        }
        public void pomjeriZa(int pomak) {
            if (pomak>0) for (int i = 0; i<pomak; i++) sljedeci();
            else for (int i = 0; i<-pomak; i++) Prethodni();
        }
        public int dajSate() { return this.sati; }
        public int dajMinute() { return this.minute; }
        public int dajSekunde() { return this.sekunde; }
        void ispisi() {
            System.out.println(":" +sati +":"+ minute + ":" + sekunde);
        }
}
