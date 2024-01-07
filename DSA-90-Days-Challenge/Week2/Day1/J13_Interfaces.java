public class J13_Interfaces{

    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        
        King k =new King();
        k.moves();

        Rook  r = new  Rook();
        r.moves();


    }
}


interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right diagonaly(all direction)");
    }
}

class King implements ChessPlayer{

    public void moves(){
        System.out.println("Left right up down diagonall(by 1 step)");
    }
}

class Rook implements ChessPlayer{

    public void moves(){
        System.out.println("Left right up down ");
    }
}