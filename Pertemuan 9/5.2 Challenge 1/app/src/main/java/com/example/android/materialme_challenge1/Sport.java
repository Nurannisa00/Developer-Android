/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.materialme_challenge1;

/**
 * Data model for each row of the RecyclerView
 */
class Sport {
    // Member variables representing the title and information about the sport.
    private String title;
    private String info;
    private final int imageResource;
    private String detail;

    public Sport(String title, String info, int imageResource, String detail) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
        this.detail = detail;
    }

    String getTitle() {
        return title;
    }

    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    String getDetail() {
        return detail;
    }
}
