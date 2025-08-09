package com.khundadze.PlaylistConverter.models_db;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.khundadze.PlaylistConverter.models.Playlist;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    // TODO:

    private String id;
    private String name;

    @JsonManagedReference
    private List<Playlist> playlists;
}
