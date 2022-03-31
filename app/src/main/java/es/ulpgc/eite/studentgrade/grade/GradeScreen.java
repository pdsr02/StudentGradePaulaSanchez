package es.ulpgc.eite.studentgrade.grade;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.studentgrade.R;
import es.ulpgc.eite.studentgrade.app.AppMediator;

/**
 * Created by Luis on marzo, 2022
 */
public class GradeScreen {

  public static void configure(GradeContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = AppMediator.getInstance();
    GradeContract.Presenter presenter = new GradePresenter(mediator);

    String[] nota = context.get().getResources().getStringArray(R.array.data);
    GradeContract.Model model = new GradeModel(nota);

    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
