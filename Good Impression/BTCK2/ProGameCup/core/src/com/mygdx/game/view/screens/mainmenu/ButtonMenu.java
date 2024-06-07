package com.mygdx.game.view.screens.mainmenu;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.SpaceGame;
import com.mygdx.game.common.constant.GameConstant;
import com.mygdx.game.common.constant.ItemConstant;
import com.mygdx.game.view.draw.text.DrawText;
import com.mygdx.game.view.draw.ui.NewButton;
import com.mygdx.game.view.draw.ui.Button;
import com.mygdx.game.view.screens.mainstory.MainStory;

import java.util.ArrayList;

public class ButtonMenu {
    Texture play, playPress, leaderboard, leaderboardPress, back, backPress, github, githubPress, musicOn, musicOff, howToPlay, howToPlayPress;
    int widthButton = ItemConstant.BUTTON_WIDTH;
    int heightButton = ItemConstant.BUTTON_HEIGHT;
    int widthIcon = ItemConstant.ICON_WIDTH;
    int heightIcon = ItemConstant.ICON_HEIGHT;
    int posX = (int)(GameConstant.WINDOW_WIDTH- widthButton)/2;
    SpriteBatch batch;
    SpaceGame game;
    ArrayList<Button> listButton;

    NewButton newButton;
    DrawText drawText;
    public ButtonMenu(SpaceGame game) {
        this.game = game;
        batch = game.getBatch();
        listButton = new ArrayList<>();
        newButton = new NewButton(game);
        drawText = new DrawText("fonts/char.fnt", Color.ORANGE);
        initMenu();
    }
    public void initMenu() {
        play = new Texture("button/menu/play.png");
        playPress = new Texture("button/menu/playPress.png");
        leaderboard = new Texture("button/menu/leaderboard.png");
        leaderboardPress = new Texture("button/menu/leaderboardPress.png");
        back = new Texture("button/menu/back.png");
        backPress = new Texture("button/menu/backPress.png");
        github = new Texture("button/menu/github.png");
        githubPress = new Texture("button/menu/githubPress.png");
        musicOn = new Texture("button/menu/musicOn.png");
        musicOff = new Texture("button/menu/musicOff.png");
        howToPlay = new Texture("button/menu/howToPlay.png");
        howToPlayPress = new Texture("button/menu/howToPlayPress.png");
    }
    

    public void draw(MainMenuScreen mainMenuScreen, MainStory mainStory){
        newButton.drawButton(play, playPress, posX,600, widthButton, heightButton,1, mainMenuScreen, mainStory, drawText);
        newButton.drawMusicButton(musicOn, musicOff, 840, 900, widthIcon, heightIcon);
        newButton.drawButton(leaderboard, leaderboardPress, posX, 500, widthButton, heightButton,4, mainMenuScreen, mainStory, drawText);
        newButton.drawButton(back, backPress, posX,  400, widthButton, heightButton,4, mainMenuScreen, mainStory, drawText);
        newButton.drawButton(github, githubPress, 15,15,widthIcon, heightIcon, 6, mainMenuScreen, mainStory, drawText);
        newButton.drawButton(howToPlay, howToPlayPress, 900, 900, widthIcon, heightIcon, 2, mainMenuScreen, mainStory, drawText);
        newButton.drawHowToPlayButton(135, 300, 672,280);
    }
}
