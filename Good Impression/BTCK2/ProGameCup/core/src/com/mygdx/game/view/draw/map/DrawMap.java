package com.mygdx.game.view.draw.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.common.constant.FrameStatus;
import com.mygdx.game.common.constant.GameConstant;
import com.mygdx.game.common.constant.MapConstant;
import com.mygdx.game.controller.MakeSize;
import com.mygdx.game.model.Player;


public class DrawMap {
    private final Texture map;
    private final Texture verticalColumn;
    private final Texture rightHorizontal;
    private final Texture leftHorizontal;
    private final Texture overlapsLeft;
    public Vector2 sizeItem;
    public DrawMap() {
        map = new Texture("maps/map.png");
        verticalColumn = new Texture("maps/verticalColumn.png");
        rightHorizontal = new Texture("maps/rightHorizontal.png");
        leftHorizontal = new Texture("maps/leftHorizontal.png");
        overlapsLeft = new Texture("maps/overlapsLeft.png");
        sizeItem = new Vector2();
    }
    public void drawMap(SpriteBatch batch){
        MakeSize makeSize = new MakeSize();
        makeSize.getSize(map, MapConstant.MAP_SIZE, sizeItem);
        MapConstant.MAP_WIDTH = sizeItem.x;
        MapConstant.MAP_HEIGHT = sizeItem.y;
        batch.draw(map, MapConstant.POS_MAP_X, MapConstant.POS_MAP_Y,
                sizeItem.x, sizeItem.y);
    }

    public void drawOverlapsMap(SpriteBatch batch, Texture texture, int posX, int posY, int sizeMap){
        MakeSize makeSize = new MakeSize();
        makeSize.getSize(texture, sizeMap, sizeItem);
        batch.draw(texture, posX, posY, sizeItem.x, sizeItem.y);
    }
    public void drawBars(SpriteBatch batch, Player player){
        drawOverlapsMap(batch, verticalColumn, 207, 209, 263);
        drawOverlapsMap(batch, leftHorizontal, 29, 185, 179);
        drawOverlapsMap(batch, rightHorizontal, 267, 179, 524);
        if (player.getFrameStatus() == FrameStatus.RIGHT_FRAME){
            drawOverlapsMap(batch, overlapsLeft, 10, 190, 370);
        }
    }
}
