package com.khundadze.PlaylistConverter.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Playlist {

    private Long id; // You can generate this yourself or use platformId as unique key
    private String platform; // e.g., "spotify", "youtube"
    private String platformId; // playlist ID from platform (good candidate for Redis key)
    private String name;

    // Instead of User entity, store user id or user info only
    private String userId;
    private String userName;
}
