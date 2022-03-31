package es.ulpgc.eite.studentgrade.grade;

/**
 * Created by Luis on marzo, 2022
 */
public class GradeModel implements GradeContract.Model {

  public static String TAG = "StudentGrade.GradeModel";

  private final String[] data;
  private int dataIndex;

  public GradeModel(String[] data) {
    this.data = data;
  }

  @Override
  public String getOption1() {
    return data[dataIndex+1];
  }

  @Override
  public String getOption2() {
    return  data[ dataIndex+2];
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");

    // TODO: include code here if is necessary

  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");

    // TODO: include code here if is necessary
  }
}