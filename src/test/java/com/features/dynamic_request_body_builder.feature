@req
Feature: Abc

  Scenario: Generate request body
    #before running comment @before in Context.java
    Given user initialize setup
    When user creates request body for photo id
      | ALBUM_ID | PHOTO_ID | TITLE                                  | URL                                    | THUMBNAIL_URL                          |
      |        1 |        2 | reprehenderit est deserunt velit ipsam | https://via.placeholder.com/600/771796 | https://via.placeholder.com/150/771796 |
