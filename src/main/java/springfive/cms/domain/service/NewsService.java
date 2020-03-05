package springfive.cms.domain.service;

import springfive.cms.domain.repository.NewsRepository;

/**
 * @author claudioed on 29/10/17. Project cms
 */
public class NewsService {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepositoy){
        this.newsRepository = newsRepositoy;
    }


}
