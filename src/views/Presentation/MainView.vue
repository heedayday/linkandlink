mpn<script setup>
import { onMounted, onUnmounted } from "vue";

import Header from "../../examples/Header.vue";
// sections
//import PresentationPages from "./Sections/PresentationPages.vue";

//images
import vueMkHeader from "@/assets/img/vue-mk-header.png";
import MaterialButton from "@/components/MaterialButton.vue";
import MaterialInput from "@/components/MaterialInput.vue";

//hooks
const body = document.getElementsByTagName("body")[0];
onMounted(() => {
  body.classList.add("presentation-page");
  body.classList.add("bg-gray-200");
});
onUnmounted(() => {
  body.classList.remove("presentation-page");
  body.classList.remove("bg-gray-200");
});
</script>

<template>
  <Header>
    <div
      class="page-header min-vh-100"
      :style="`background-image: url(${vueMkHeader})`"
      loading="lazy"
    >

      <div class="container">
        <div class="row">
          <div class="col-lg-10 text-center mx-auto position-relative">
            <h1
              class="text-white pt-3 mt-n5 me-2"
              :style="{ display: 'inline-block ' }"
            >
              LinkandLink
            </h1>
            <p class="lead text-white px-5 mt-3" :style="{ fontWeight: '500' }">
            </p>
          </div>
        </div>


      </div>
      <div class="container">
      <div>
        <div class="card card-body blur shadow-blur mx-3 mx-md-4 mt-n6">
          <div class="row">
            <div class="col-10">
              <MaterialInput
                  class="input-group-outline"
                  id="email"
                  :label="{ text: '', class: 'form-label' }"
                  type="email"
              />
            </div>
            <div class="col-2 ps-0">
              <MaterialButton
                  variant="gradient"
                  color="success"
                  class="mb-0 h-100 position-relative z-index-2"
              >Search</MaterialButton
              >
            </div>
          </div>
        </div>
      </div>
    </div>
    </div>
  </Header>
</template>
