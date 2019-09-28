package akame.dodger.model;

import akame.dodger.core.CharacterImageLoader;

import java.awt.image.BufferedImage;

public class Thumbnail {
    private String fileName;
    private String roundLeft;
    private String roundRight;
    private String charOneName;
    private String charTwoName;
    private String playerOne;
    private String playerTwo;

    private BufferedImage background;
    private BufferedImage logo;
    private BufferedImage charOne;
    private BufferedImage charTwo;
    private BufferedImage upperBanner;
    private BufferedImage lowerBanner;

    private BufferedImage finalPicture;


    public Thumbnail() {
    }

    public Thumbnail(String roundFull, String charOneName, String charTwoName, int charOneSkin, int charTwoSkin, String playerOne, String playerTwo) {
        String[] round = roundFull.split(" ");
        roundLeft = round[0];
        roundLeft = round[2] != null ? round[1].concat(round[2]) : round[1]; // Round might have 2 or 3 words, first word is going to left so the rest go to the right
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        this.charOne = CharacterImageLoader.getCharacterImage(charOneName, charOneSkin);
        this.charTwo = CharacterImageLoader.getCharacterImage(charTwoName, charTwoSkin);
    }

    public String getCharOneName() {
        return charOneName;
    }

    public void setCharOneName(String charOneName) {
        this.charOneName = charOneName;
    }

    public String getCharTwoName() {
        return charTwoName;
    }

    public void setCharTwoName(String charTwoName) {
        this.charTwoName = charTwoName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRoundLeft() {
        return roundLeft;
    }

    public void setRoundLeft(String roundLeft) {
        this.roundLeft = roundLeft;
    }

    public String getRoundRight() {
        return roundRight;
    }

    public void setRoundRight(String roundRight) {
        this.roundRight = roundRight;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public BufferedImage getBackground() {
        return background;
    }

    public void setBackground(BufferedImage background) {
        this.background = background;
    }

    public BufferedImage getLogo() {
        return logo;
    }

    public void setLogo(BufferedImage logo) {
        this.logo = logo;
    }

    public BufferedImage getCharOne() {
        return charOne;
    }

    public void setCharOne(BufferedImage charOne) {
        this.charOne = charOne;
    }

    public BufferedImage getCharTwo() {
        return charTwo;
    }

    public void setCharTwo(BufferedImage charTwo) {
        this.charTwo = charTwo;
    }

    public BufferedImage getUpperBanner() {
        return upperBanner;
    }

    public void setUpperBanner(BufferedImage upperBanner) {
        this.upperBanner = upperBanner;
    }

    public BufferedImage getLowerBanner() {
        return lowerBanner;
    }

    public void setLowerBanner(BufferedImage lowerBanner) {
        this.lowerBanner = lowerBanner;
    }

    public BufferedImage getFinalPicture() {
        return finalPicture;
    }

    public void setFinalPicture(BufferedImage finalPicture) {
        this.finalPicture = finalPicture;
    }
}
