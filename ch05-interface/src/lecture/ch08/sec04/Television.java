package lecture.ch08.sec04;

public class Television implements RemoteControl{
    private int volume;  // TV 음량

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {
        // 1) 전달된 volume 값이 최대볼륨값보다 크면 최대값으로 설정
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
