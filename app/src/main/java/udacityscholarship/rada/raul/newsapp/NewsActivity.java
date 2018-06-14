package udacityscholarship.rada.raul.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    /** TextView displayed when the ListView is empty */
    private TextView emptyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        emptyTextView = (TextView) findViewById(R.id.empty_text_view);


        /** ListView containing a list of articles */
        ListView articlesListView = (ListView) findViewById(R.id.articles_list_view);
        articlesListView.setEmptyView(emptyTextView);

        ArrayList<Article> articles = new ArrayList<Article>();
        articles.add(new Article("titlu 1", "fotbal", "eu", "01.01.2018", "www.ll.ro"));
        articles.add(new Article("titlu 1", "fotbal", "", "", "www.mm.ro"));
        articles.add(new Article("titlu 1", "fotbal", "", "01.03.2018", "www.ll.ro"));

        ArticleAdapter articleAdapter = new ArticleAdapter(this,articles);
        articlesListView.setAdapter(articleAdapter);

    }
}
