package facade.hometheater;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector,
                             TheaterLights lights, Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");

        dvd.stop();
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        lights.on();
    }
}