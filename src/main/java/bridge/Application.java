package bridge;

import bridge.BridgeGame.MoveResult;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        System.out.println(inputView.readBridgeSize());
        System.out.println(inputView.readMoving());
        System.out.println(inputView.readGameCommand());
    }
}
