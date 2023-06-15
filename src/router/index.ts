import { createRouter, createWebHistory } from "vue-router";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: "/home",
      alias: "/",
      name: "Home",
      component: () => import("@/layout/Layout.vue"),
    },
  ],
});

export default router;
