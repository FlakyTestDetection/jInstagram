package org.jinstagram.entity.users.feed;

import java.util.List;

import org.jinstagram.entity.common.Caption;
import org.jinstagram.entity.common.Comments;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.Likes;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.common.User;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;

import com.google.gson.annotations.SerializedName;

public class MediaFeedData {
	@SerializedName("caption")
	private Caption caption;

	@SerializedName("comments")
	private Comments comments;

	@SerializedName("created_time")
	private String createdTime;

	@SerializedName("id")
	private String id;

	@SerializedName("filter")
	private String imageFilter;

	@SerializedName("images")
	private Images images;

	@SerializedName("videos")
	private Videos videos;

	@SerializedName("likes")
	private Likes likes;

	@SerializedName("link")
	private String link;

	@SerializedName("location")
	private Location location;

	@SerializedName("tags")
	private List<String> tags;

	public static final String TYPE_IMAGE = "image";
	public static final String TYPE_VIDEO = "video";
	public static final String TYPE_CAROUSEL = "carousel";

	@SerializedName("type")
	private String type;

	@SerializedName("user")
	private User user;

	@SerializedName("user_has_liked")
	private boolean userHasLiked;

	@SerializedName("users_in_photo")
	private List<UsersInPhoto> usersInPhotoList;

	@SerializedName("carousel_media")
	private List<CarouselMedia> carouselMedia;
	
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the comments
	 */
	public Comments getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(Comments comments) {
		this.comments = comments;
	}

	/**
	 * @return the caption
	 */
	public Caption getCaption() {
		return caption;
	}

	/**
	 * @param caption the caption to set
	 */
	public void setCaption(Caption caption) {
		this.caption = caption;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the likes
	 */
	public Likes getLikes() {
		return likes;
	}

	/**
	 * @param likes the likes to set
	 */
	public void setLikes(Likes likes) {
		this.likes = likes;
	}

	/**
	 * @return the createdTime
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the images
	 */
	public Images getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(Images images) {
		this.images = images;
	}

	/**
	 * @return the imageFilter
	 */
	public String getImageFilter() {
		return imageFilter;
	}

	/**
	 * @param imageFilter the imageFilter to set
	 */
	public void setImageFilter(String imageFilter) {
		this.imageFilter = imageFilter;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public boolean isUserHasLiked() {
		return userHasLiked;
	}

	public void setUserHasLiked(boolean userHasLiked) {
		this.userHasLiked = userHasLiked;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Videos getVideos() {
		return videos;
	}

	public void setVideos(Videos videos) {
		this.videos = videos;
	}

	public List<UsersInPhoto> getUsersInPhotoList() {
		return usersInPhotoList;
	}

	public void setUsersInPhotoList(List<UsersInPhoto> usersInPhotoList) {
		this.usersInPhotoList = usersInPhotoList;
	}

	/**
	 * Return the carousel media.
	 *
	 * @return {@link List} of {@link CarouselMedia} the carousel media
	 */
	public List<CarouselMedia> getCarouselMedia() {
        return carouselMedia;
    }

	/**
	 * Set the carousel media.
	 *
	 * @param carouselMedia {@link List} of {@link CarouselMedia} the carousel media
	 */
	public void setCarouselMedia(List<CarouselMedia> carouselMedia) {
        this.carouselMedia = carouselMedia;
    }

    @Override
	public String toString() {
		return String
				.format("MediaFeedData [caption=%s, comments=%s, createdTime=%s, id=%s, imageFilter=%s, images=%s, likes=%s, link=%s, location=%s, tags=%s, type=%s, user=%s, userHasLiked=%s, usersInPhoto=%s]",
						caption, comments, createdTime, id, imageFilter, images, likes, link, location, tags, type,
						user, userHasLiked, usersInPhotoList);
	}
}
