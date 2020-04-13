package com.pojos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This pojo has been auto generated
 * 
 * 1. Can be taken using plugin | refer: schema2pojo.txt
 * 2. Or can be generated manually using |  http://www.jsonschema2pojo.org/
 * 
 * @author Sheetal_Singh
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "albumId",
    "id",
    "title",
    "url",
    "thumbnailUrl"
})
public class PhotoIdPojo {
    @JsonProperty("albumId")
    private Integer albumId;

    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("thumbnailUrl")
    private String thumbnailUrl;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("albumId")
    public Integer getAlbumId() {
        return albumId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("albumId")
    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public PhotoIdPojo withAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public PhotoIdPojo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PhotoIdPojo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public PhotoIdPojo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thumbnailUrl")
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public PhotoIdPojo withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PhotoIdPojo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhotoIdPojo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("albumId");
        sb.append('=');
        sb.append(((this.albumId == null)?"<null>":this.albumId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("thumbnailUrl");
        sb.append('=');
        sb.append(((this.thumbnailUrl == null)?"<null>":this.thumbnailUrl));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.albumId == null)? 0 :this.albumId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.thumbnailUrl == null)? 0 :this.thumbnailUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhotoIdPojo) == false) {
            return false;
        }
        PhotoIdPojo rhs = ((PhotoIdPojo) other);
        return (((((((this.albumId == rhs.albumId)||((this.albumId!= null)&&this.albumId.equals(rhs.albumId)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.thumbnailUrl == rhs.thumbnailUrl)||((this.thumbnailUrl!= null)&&this.thumbnailUrl.equals(rhs.thumbnailUrl))));
    }

}
