package in.clouthink.daas.sbb.news.rest.dto;

import in.clouthink.daas.sbb.news.domain.model.News;
import in.clouthink.daas.sbb.news.domain.request.NewsQueryRequest;
import in.clouthink.daas.sbb.shared.domain.request.impl.DateRangedQueryParameter;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 *
 */
@ApiModel
public class NewsQueryParameter extends DateRangedQueryParameter implements NewsQueryRequest {

	private String title;

	private String category;

	private Boolean published;

	private News.NewsType newsType;

	private Date createdAtBegin;

	private Date createdAtEnd;

	@Override
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public Boolean getPublished() {
		return published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	@Override
	public News.NewsType getNewsType() {
		return newsType;
	}

	public void setNewsType(News.NewsType newsType) {
		this.newsType = newsType;
	}

	@Override
	public Date getCreatedAtBegin() {
		return createdAtBegin;
	}

	public void setCreatedAtBegin(Date createdAtBegin) {
		this.createdAtBegin = createdAtBegin;
	}

	@Override
	public Date getCreatedAtEnd() {
		return createdAtEnd;
	}

	public void setCreatedAtEnd(Date createdAtEnd) {
		this.createdAtEnd = createdAtEnd;
	}
}
