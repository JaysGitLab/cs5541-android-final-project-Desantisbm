package desantisenterprise.ascabcapoeirahub;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.R.attr.x;

/**
 * Created by Broderick on 9/27/2016.
 */

public class Sequence extends ArrayList{
    private boolean favorite = false;
    private boolean blackList = false;
    public ArrayList<Movement> moveList;

    private static final String JSON_BLACKLIST = "if the sequence is blacklisted";
    private static final String JSON_FAVORITES= "if the Sequence is favorited";
    private static final String JSON_MOVEMENTNAMES = "Names of stored movements";
    private static final String JSON_GIFLINKS = "resource links to all movements";
    private static final String JSON_BELTS = "List color of all movements";


    public Sequence(){
        moveList = new ArrayList<>();
    }

    public void toggleFavorite(){
        if(favorite) favorite = false;
        else{
            favorite = true;
            blackList = false;
        }
    }

    public void toggleBlackList(){
        if(blackList) blackList = false;
        else{
            blackList = true;
            favorite = false;
        }
    }

    public void addMove(Movement move){
        moveList.add(move);
    }

    public boolean getBlackList(){
        return blackList;
    }

    public boolean getFavorites(){
        return favorite;
    }

    public ArrayList<Movement> getArray(){
        return moveList;
    }

    public int size(){return moveList.size();}



    public void createGray (Sequence moveList){
        moveList.addMove( new Movement("Ginga", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Au Fechado", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Au Aberto", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Au Dobrado", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Au Agulha", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Rasteira ou Chileno", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Negativa Fugida e Role", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Negativa Fugida Chapeu de Coro", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Negativa Lateral e Role", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Negativa de Fundo e Role", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Cocorinha", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Cocorinha na Lateral", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Cocorinha Fugida", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Bencao", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Ponteira", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Chapa de Frente", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Meia Lua de Frente", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Armada", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Resistencia", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Queixada", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Queda de Tres", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Queda de Quatro", R.drawable.placeholder, "Gray"));
        moveList.addMove( new Movement("Martelo de Estralo", R.drawable.placeholder, "Gray"));
    }

    public void createGreen(Sequence moveList){
        moveList.addMove( new Movement("Bananeira", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Au Bananeira", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Au Negativa e Role", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Au Aberto Duplo", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Au Aberto e Queixada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Au Aberto Negativa e Chapeu de Couro", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Au Queda de Rins", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Esquiva Lateral e Negativa e Role", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Queda de Treis e Rasteira", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Martelo de Giro", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Martelo de Giro Duplo", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Queixada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Armada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Meia Lua de Compasso", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("S, Dobrado", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Meia Lua de Frente e Armada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Chapa Cruzada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Chapa Cruzada Pulada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Espelho e Role", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Tesoura de Chao", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Banda Lisa", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Bencao Pulada", R.drawable.placeholder, "Green"));
        moveList.addMove( new Movement("Martelo Antecipado", R.drawable.placeholder, "Green"));

    }

    public void createYellow(Sequence moveList){
        moveList.addMove( new Movement("Giro de Negativa", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Negativa e Au Aberto", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Au Aberto e Meia Lua de Compasso", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Au Batido", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Au Olimpico", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Au Giratorio", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Au Queda de Rins", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Esquiva Lateral e Chapa de Frente", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Queda de Treis e Rasteira", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Ponte", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Au de Frente", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Queixada Dupla", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Martelo Anticipado", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Chapa Giratoria", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Martelo Pulado", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Parafuso", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Parafuso na Meia Lua de Frente", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Banda Trancada", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Meia Lua de Frente e Au Aberto", R.drawable.placeholder, "Yellow"));
        moveList.addMove( new Movement("Meia Lua de Frente e Meia Lua de Compasso", R.drawable.placeholder, "Yellow"));
    }
    public void createBlue(Sequence moveList){
        moveList.addMove( new Movement("Au Aberto Pulado", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au Parado na Bananeira", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au Batido Duplo", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au Chibata", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("A Batido na Queda de Rins", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au Queda de Rins Beliscando no Martelo", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au na Queda de Rins parado na Tesoura", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au Cortado e Tesoura", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au Espinha", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Au de Frente na Ponte e Volta", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Macaco", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("S Macacada", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Bencao e Martelo Antecipado", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Chapa de Frente e Martelo Antecipado", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Chapa Giratoria Pulada", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Armada Pulada", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Chibata Em Pe", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Martelo Pulado Duplo", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Rabo de Araia Cortado", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Rabo de Araia", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Meia Lua Solta", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Martelo de Giro Duplo", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Tesoura de chao", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Tesoura na Cintura", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Vingativa", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Camaleao", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Duplo Role de Negativa", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Banda Trancada", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("S, Chapa de Chao", R.drawable.placeholder, "Blue"));
        moveList.addMove( new Movement("Espelho e Role", R.drawable.placeholder, "Blue"));
    }
    public void creategreenYellow(Sequence moveList){
        moveList.addMove( new Movement("Au Cocorinha e Chapeu de Couro", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("S,Martelo de Giro", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Martelo de Giro, S e Chapeu de Couro", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Rabo de Arraia Cortado e Martelo Antecipado", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Martelo de Giro e Chapa Cruzada de Chao", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Queixada Lateral e Martelo de Giro", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Martelo Rodado", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Chapa Giratoria de Chao", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Torcido", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Aberto e Martelo Pulado", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Batido Cai Na Negativa", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Esquadro", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Aberto e Bencao Pulada", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Aberto e Macaco", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Negativa, Role e Macaco", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Queda de Rins e S Dobrado", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Armada e Au de Frente", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au de Frente na Bencao", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Macaco Dobrado", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Armada e S, Macaco", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Macaco Na Queda De Rins", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Macaco Olimpico", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Meia Lua de Frente e Macaco Olimpico", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Queixada e Macaco Olimpico", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Negativa Role e Au De Frente Na Ponte E Volta", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Piao na Queda de Rins", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Bencao e Ponte", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Pontinha", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au Radar", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Au sem mao", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Martelo de giro e queixada", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Martelo de Giro e Armada", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Martelo de Giro e Parafuso", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Meia Lua de Compasso e Au de Frente na Ponte", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Chapa contra Chapa", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Cruz", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Chapa Giratoria contra Chapa Giratoria", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Gancho", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Gato ou Xango", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Macaco, Bananeira, Tesoura, Negativa chapeu de Couro.", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Rasteira e Chapa de Chao", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Giro de Negativa troca a perna Au Cabeca no Chao", R.drawable.placeholder, "GreenYellow"));
        moveList.addMove( new Movement("Chaveco de Queixada e Chapa Cruzada", R.drawable.placeholder, "GreenYellow"));
    }
    public void creategreenBlue(Sequence moveList){
        moveList.addMove( new Movement("Macaco e Molla", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("S Macacada na Queda de Rins", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("S Bananeira", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("S Piao de Mao", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Flutuante", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Ponte na Queda de Rins", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Escorpiao", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Martelo Voador", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Meia Lua de Frente puxando No Macaco", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Parafuso na Meia Lua de Frente Puxando no Macaco", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Meia Lua de Compasso e S Macaco", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Armada,Giro de Armada e Rasteira(ou Martelo de Giro)", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Macaco Olimpico Dobrado", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Chapa,Bencao e Ponte", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Parafuso,Role e Martelo de Giro", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Meia Lua de Compasso, corta na lateral, Role e Au", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Travar o Chapeu de Couro", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Queixada Lateral volta Martelo", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Armada Lateral volta Martelo", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Meia lua de Compasso vota Martelo", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Calcanheira", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Inicia Meia lua de Compasso,muda para Negativa e Chapeu de Couro", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Armada,falso parafuso solta Meia Lua de Compasso", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Falsa Vingativa e Martelo", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Falsa Queixada vai Negativa", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Falsa Queixada entra com Chapa", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Falsa Meia Lua de Compasso e Bencao", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Chaveco de Queixada vai na Rasteira", R.drawable.placeholder, "GreenBlue"));
        moveList.addMove( new Movement("Chaveco de queixada vai na Vingativa", R.drawable.placeholder, "GreenBlue"));
    }
    public void createyellowBlue(Sequence moveList){
        moveList.addMove( new Movement("Diferente maneiras de entrar na roda", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Angola jogo baixo", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Agarrao", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Chaveco de ginga", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Gato e molla", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Negativa e Gato", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Ponteiro e Gato", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Au Agulia e Gato", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Mortal", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Au Agulia e Mortal", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Au Agulia Gato e Mortal", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("S Coice", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Banda", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Banda Trancada", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Banda de Costas", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Travar Armada", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Travar Negativa", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Derrubar Frequentemente o Adversario na roda", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Corta capim", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Joelhada", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Cabecada", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Palma", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Galopante", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Telefone", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Cotovelo", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Desprezo", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Vingativa", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Tesoura de Frente", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Tesoura de Costas", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Tesoura na Cintura", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Tesoura no Pescoco", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Voo do Morcego", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Espelho Duplo", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Tombo da Ladeira", R.drawable.placeholder, "yellowBlue"));

        moveList.addMove( new Movement("Volta do Mundo", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Asfixiante", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Chamada da Palma de Frente", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Chamada Aberta de Frente", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Chamada Aberta de Costas", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Chamada de Entrada na Barriga", R.drawable.placeholder, "yellowBlue"));
        moveList.addMove( new Movement("Chamada do Sapinho", R.drawable.placeholder, "yellowBlue"));

    }
    public void createOther(Sequence moveList){
        moveList.addMove( new Movement("Woo", R.drawable.placeholder, "Other"));

    }




    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        String[] moveNames = new String[moveList.size()];
        int[] links = new int[moveList.size()];
        String[] belts = new String[moveList.size()];

        for (int i = 0; i < moveList.size(); i++){
            moveNames[i] = moveList.get(i).getMovementName();
            links[i] = moveList.get(i).getGifLink();
            belts[i] = moveList.get(i).getBeltList();
        }

        json.put(JSON_MOVEMENTNAMES, moveNames);
        json.put(JSON_GIFLINKS, links);
        json.put(JSON_BELTS, belts);
        json.put(JSON_BLACKLIST, getBlackList());
        json.put(JSON_FAVORITES, getFavorites());

        return json;
    }





}
