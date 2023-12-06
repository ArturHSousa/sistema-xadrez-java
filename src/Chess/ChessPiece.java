/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

import boardgame.Board;
import boardgame.Piece;

/**
 *
 * @author artuz
 */
public class ChessPiece extends Piece {
    
    private Color color;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() { //DEIXADO APENAS O "GET" POIS O "SET" ABRIRIA ESPAÇO PARA QUE POSSAM ALTERAR A COR DAS PEÇAS
        return color;
    }


    
}
