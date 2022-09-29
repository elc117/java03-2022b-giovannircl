public class TeamMate {
  private String userID;
  private String name;
  private boolean online;

  public TeamMate() {
    this.userID = "";
    this.name = "";
    this.online = false;
  }

  public TeamMate(String id, String name, boolean on) {
    this.userID = id;
    this.name = name;
    this.online = on;
  }

  public TeamMate(String id, String name) {
    this.userID = id;
    this.name = name;
    this.online = false;
  }

  public void setUserID(String id) {
    this.userID = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOnline(boolean on) {
    this.online = on;
  }

  public String getUserID() {
    return this.userID;
  }

  public String getName() {
    return this.name;
  }

  public boolean getOnline() {
    return this.online;
  }

}
