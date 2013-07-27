package demo.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ymegm
 * Date: 16-5-13
 * Time: 8:08
 */
public class Movie implements Serializable{

	private Integer id;
    private Genre[] genres;
	private String title;
	private Date dateAdded = new Date();
	private Integer yearOfRelease;

    public static void clone(Movie dest, final Movie src) {
        dest.setId(src.getId());
        dest.setGenres(src.getGenres());
        dest.setTitle(src.getTitle());
        dest.setDateAdded(src.getDateAdded());
        dest.setYearOfRelease(src.getYearOfRelease());
    }

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if (!(other instanceof Movie)) {
			return false;
		}
		Movie castOther = (Movie) other;
		return new EqualsBuilder().append(this.getId(), castOther.getId()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", getId()).toString();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Genre[] getGenres() {
		return genres;
	}

	public void setGenres(Genre[] genres) {
		this.genres = genres;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
