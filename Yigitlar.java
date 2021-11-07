package yigitlar;

class eleman {

    int içerik;

    public eleman(int içerik) {
        this.içerik = içerik;
    }

}

public class Yigitlar {

    eleman[] dizi;
    int ust;
    int N;

    public Yigitlar(int N) {
        this.N = N;
        dizi = new eleman[N];
        ust -= 1;
    }

    boolean bosmu() {
        return ust == -1;
    }

    boolean dolumu() {
        return ust == N - 1;
    }
    
    void push(eleman e){
        if (!dolumu()) {
            ust++;
            dizi[ust]=e;
        }
    }
    eleman pop(){
        if (!bosmu()) {
            ust--;
            return dizi[ust+1];
            
        }
        return null;
    }
    eleman top(){
        if (!bosmu()) {
            return dizi[ust];
        }
        else
        return null;
    }

    public static void main(String[] args) {
    Yigitlar y = new Yigitlar(15);
    
        for (int i = 0; i < 10; i++) {
            y.push(new eleman(i));
        }
        System.out.println(y.top().içerik);
        while(!y.bosmu()){
            System.out.println(y.pop().içerik);
        }
        
    }

}
