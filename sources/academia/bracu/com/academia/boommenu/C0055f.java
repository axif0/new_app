package academia.bracu.com.academia.boommenu;

import academia.bracu.com.academia.boommenu.p001a.C0016b;
import academia.bracu.com.academia.boommenu.p002c.C0032b;
import academia.bracu.com.academia.boommenu.p002c.C0035e;
import academia.bracu.com.academia.boommenu.p003h.C0060d;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.f */
class C0055f {
    /* renamed from: a */
    static void m267a(BoomMenuButton boomMenuButton, ArrayList<C0032b> arrayList) {
        int i;
        if (boomMenuButton.getButtonEnum() == null || boomMenuButton.getButtonEnum().equals(C0054e.Unknown)) {
            throw new RuntimeException("Unknown button-enum!");
        } else if (boomMenuButton.getPiecePlaceEnum() == null || boomMenuButton.getPiecePlaceEnum().equals(C0060d.Unknown)) {
            throw new RuntimeException("Unknown piece-place-enum!");
        } else if (boomMenuButton.getButtonPlaceEnum() == null || boomMenuButton.getButtonPlaceEnum().equals(C0035e.Unknown)) {
            throw new RuntimeException("Unknown button-place-enum!");
        } else if (boomMenuButton.getBoomEnum() == null || boomMenuButton.getBoomEnum().equals(C0016b.Unknown)) {
            throw new RuntimeException("Unknown boom-enum!");
        } else if (arrayList == null || arrayList.size() == 0) {
            throw new RuntimeException("Empty builders!");
        } else {
            int pieceNumber = boomMenuButton.getPiecePlaceEnum().pieceNumber();
            int minPieceNumber = boomMenuButton.getPiecePlaceEnum().minPieceNumber();
            int maxPieceNumber = boomMenuButton.getPiecePlaceEnum().maxPieceNumber();
            int size = boomMenuButton.getCustomPiecePlacePositions().size();
            int buttonNumber = boomMenuButton.getButtonPlaceEnum().buttonNumber();
            int minButtonNumber = boomMenuButton.getButtonPlaceEnum().minButtonNumber();
            int maxButtonNumber = boomMenuButton.getButtonPlaceEnum().maxButtonNumber();
            int size2 = boomMenuButton.getCustomButtonPlacePositions().size();
            int size3 = arrayList.size();
            if (pieceNumber == -1) {
                i = size2;
                if (buttonNumber != -1 && (minPieceNumber > buttonNumber || buttonNumber > maxPieceNumber)) {
                    throw new RuntimeException("The number(" + buttonNumber + ") of buttons of button-place-enum(" + boomMenuButton.getButtonPlaceEnum() + ") is not in the range([" + minPieceNumber + ", " + maxPieceNumber + "]) of the piece-place-enum(" + boomMenuButton.getPiecePlaceEnum() + ")");
                } else if (minPieceNumber > size3 || size3 > maxPieceNumber) {
                    throw new RuntimeException("The number of builders(" + size3 + ") is not in the range([" + minPieceNumber + ", " + maxPieceNumber + "]) of the piece-place-enum(" + boomMenuButton.getPiecePlaceEnum() + ")");
                }
            } else {
                i = size2;
                if (buttonNumber != -1) {
                    if (pieceNumber != buttonNumber) {
                        throw new RuntimeException("The number of piece(" + pieceNumber + ") is not equal to buttons'(" + buttonNumber + ")");
                    } else if (pieceNumber != size3) {
                        throw new RuntimeException("The number of piece(" + pieceNumber + ") is not equal to builders'(" + size3 + ")");
                    }
                }
            }
            if (boomMenuButton.getPiecePlaceEnum().equals(C0060d.Custom)) {
                if (size > 0) {
                    if (buttonNumber == -1) {
                        if (minButtonNumber > size || size > maxButtonNumber) {
                            throw new RuntimeException("When the positions of pieces is customized, the length(" + size + ") of custom-piece-place-positions array is not in the range([" + minButtonNumber + ", " + maxButtonNumber + "])");
                        }
                    } else if (size != buttonNumber) {
                        throw new RuntimeException("The number of piece(" + size + ") is not equal to buttons'(" + buttonNumber + ")");
                    }
                    if (size != size3) {
                        throw new RuntimeException("The number of piece(" + size + ") is not equal to builders'(" + size3 + ")");
                    }
                } else {
                    throw new RuntimeException("When the positions of pieces are customized, the custom-piece-place-positions array is empty");
                }
            }
            if (!boomMenuButton.getButtonPlaceEnum().equals(C0035e.Custom)) {
                return;
            }
            if (i > 0) {
                int i2 = i;
                if (pieceNumber == -1) {
                    if (minPieceNumber > i2 || i2 > maxPieceNumber) {
                        throw new RuntimeException("When the positions of buttons is customized, the length(" + i2 + ") of custom-button-place-positions array is not in the range([" + minPieceNumber + ", " + maxPieceNumber + "])");
                    }
                } else if (i2 != pieceNumber) {
                    throw new RuntimeException("The number of button(" + i2 + ") is not equal to pieces'(" + pieceNumber + ")");
                }
                if (i2 != size3) {
                    throw new RuntimeException("The number of button(" + i2 + ") is not equal to builders'(" + size3 + ")");
                }
                return;
            }
            throw new RuntimeException("When the positions of buttons are customized, the custom-button-place-positions array is empty");
        }
    }
}
