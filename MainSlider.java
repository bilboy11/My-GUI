import javax.swing.event.ChangeEvent;

public class MainSlider {
    public static void main(String[] args) {

        // slider = component that lets user enter a value by using an adjustable sliding knob on a track

        SliderDemo sliderDemo = new SliderDemo() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("degree celcius" + " " + slider.getValue());

            }
        };


    }
}
