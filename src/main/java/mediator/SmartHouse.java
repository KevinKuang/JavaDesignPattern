package mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class SmartHouse extends Mediator {

    private Map<String, Colleague>  colleagueMap = new HashMap<>();
    private Map<String, Class> classMap = new HashMap<>();


    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.putIfAbsent(name,colleague);
        classMap.putIfAbsent(name,colleague.getClass());
    }

    @Override
    public void getMsg(int changeState, String name) {
        Colleague colleague = colleagueMap.get(name);
        if (colleague instanceof Alarm){
            alarmDo(changeState);
        }else if (colleague instanceof Curtain){
            curtainDo();
        }else if (colleague instanceof TV){

        }
    }

    @Override
    public void sendMsg() {

    }

    private void alarmDo(int stateChange){
        if (stateChange == 0){
            findClassObjectList(Curtain.class).forEach(colleague -> ((Curtain)colleague).down());
            findClassObjectList(TV.class).forEach(colleague -> ((TV)colleague).on());
        }else if (stateChange == 1){
            findClassObjectList(TV.class).forEach(colleague -> ((TV)colleague).on());
        }
    }

    private void curtainDo(){
        findClassObjectList(TV.class).forEach(colleague -> ((TV)colleague).on());
    }

    private List<Colleague> findClassObjectList(Class<? extends Colleague> clazz){
        List<Colleague> list = new ArrayList<>();
        colleagueMap.forEach((s, colleague) -> {
            if (colleague.getClass().equals(clazz)){
                list.add(colleague);
            }
        });
        return list;
    }
}
