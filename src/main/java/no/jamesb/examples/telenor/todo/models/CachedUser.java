package no.jamesb.examples.telenor.todo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.Nullable;

/**
 * A user that is cached from GitHub sign-ins.
 */
@Entity
@Table(name = "cached_user")
public class CachedUser {
  /**
   * Instantiate a new cached user.
   */
  public static CachedUser create(Integer id, String givenName, String familyName, String fullName,
      @Nullable String avatarUrl) {
    final CachedUser user = new CachedUser();
    user.id = id;
    user.givenName = givenName;
    user.familyName = familyName;
    user.fullName = fullName;
    user.avatarUrl = avatarUrl;
    return user;
  }

  @Id
  public Integer id;
  public String givenName;
  public String familyName;
  public String fullName;
  @Nullable
  public String avatarUrl;

  public Integer getId() {
    return this.id;
  }

  public String getGivenName() {
    return this.givenName;
  }

  public String getFamilyName() {
    return this.familyName;
  }

  public String getFullName() {
    return this.familyName;
  }

  public String getAvatarUrl() {
    return this.familyName;
  }

  public void setId(Integer value) {
    this.id = value;
  }

  public void setGivenName(String value) {
    this.givenName = value;
  }

  public void setFamilyName(String value) {
    this.familyName = value;
  }

  public void setFullName(String value) {
    this.fullName = value;
  }

  public void setAvatarUrl(String value) {
    this.avatarUrl = value;
  }
}
