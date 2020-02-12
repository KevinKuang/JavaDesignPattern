package commnd;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    // 记住上一次的命令
    private Command undoCommands;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = NoCommand.getInstance();
            offCommands[i] = NoCommand.getInstance();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand){
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    public void pushOnButton(int no){
        this.onCommands[no].execute();
        this.undoCommands = this.onCommands[no];
    }

    public void pushOffButton(int no){
        this.offCommands[no].execute();
        this.undoCommands = this.offCommands[no];
    }

    public void pushUndoButton(){
        this.undoCommands.undo();
        this.undoCommands = NoCommand.getInstance();
    }

}
