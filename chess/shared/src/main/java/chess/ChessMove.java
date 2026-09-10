package chess;

import java.util.Objects;

/**
 * Represents moving a chess piece on a chessboard
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessMove {

    private final ChessPosition startPosition;
    private final ChessPosition endPosition;
    private final ChessPiece.PieceType promotionPiece;

    public ChessMove(ChessPosition startPosition, ChessPosition endPosition,
                     ChessPiece.PieceType promotionPiece) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.promotionPiece = promotionPiece;
    }

    /**
     * @return ChessPosition of starting location
     */
    public ChessPosition getStartPosition() {
        return this.startPosition;
    }

    /**
     * @return ChessPosition of ending location
     */
    public ChessPosition getEndPosition() {
        return this.endPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessMove that = (ChessMove) o;
        return (startPosition.equals(that.startPosition) &&
                endPosition.equals(that.endPosition) &&
                promotionPiece == that.promotionPiece);
    }

    @Override
    public int hashCode() {
        int result = (this.startPosition != null ? this.startPosition.hashCode() : 0);
        result = 31 * result + (this.endPosition != null ? this.endPosition.hashCode() : 0);
        result = 31 * result + (this.promotionPiece != null ? this.promotionPiece.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("ChessMove{startPosition=%s, endPosition=%s, promotionPiece=%s}",
                this.startPosition, this.endPosition, this.promotionPiece);
    }

    /**
     * Gets the type of piece to promote a pawn to if pawn promotion is part of this
     * chess move
     *
     * @return Type of piece to promote a pawn to, or null if no promotion
     */
    public ChessPiece.PieceType getPromotionPiece() {
        return this.promotionPiece;
    }
}
