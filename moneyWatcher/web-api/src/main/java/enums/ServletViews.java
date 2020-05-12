package enums;

public enum ServletViews {

    HEALTH_CHECK("/WEB-INF/views/HealthCheck.jsp");

    private String view;

    ServletViews(String view) {
        this.view = view;
    }


    @Override
    public String toString() {
        return view;
    }
}
