package com.neng.app.mediator.dome;

/**
 * 中介者-- 主板
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class BoardMediator extends Mediator {

    private CPU cpu;
    private CDDevice cdDevice;
    private GraphicsCard graphicsCard;
    private SoundCard soundCard;


    @Override
    public void changed(Colleague colleague) {
        if (colleague == cpu) {
            handleCPU(cpu);
        } else if (colleague == cdDevice) {
            handleCD(cdDevice);
        }
    }

    /**
     * 处理光驱数据，给其他设备交互
     *
     * @param cdDevice
     */
    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.getData());
    }

    /**
     * 处理CPU读取数据后，给其他设备交互
     *
     * @param cpu
     */
    private void handleCPU(CPU cpu) {
        graphicsCard.videopPlay(cpu.getDataVideo());
        soundCard.soundPlay(cpu.getDataSound());
    }


    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
