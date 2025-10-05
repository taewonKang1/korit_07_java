package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;            // 접근지정자 클래스면 객체명 -> 여태까지의 작성방법과 다릅니다.
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() { powerButton.onPressed(); }

    public void onPressedChannelDownButton() { channelDownButton.onPressed(); }

    public void onDownChannelDownButton() { channelDownButton.onDown(); }

    public void onPressedChannelUpButton() { channelUpButton.onPressed(); }

    public void onUpChannelUpButton() { System.out.println(channelUpButton.onUp()); }

    public void onPressedVolumeDownButton() { volumeDownButton.onPressed(); }

    public void onDownVolumeDownButton() { volumeDownButton.onDown(); }

    public void onPressedVolumeUpButton() { volumeUpButton.onPressed(); }

    public void onUpVolumeUpButton1() { System.out.println(volumeUpButton.onUp()); }

    public String onUpVolumeUpButton2() { return volumeUpButton.onUp(); }
}
