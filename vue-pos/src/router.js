import { createRouter, createWebHistory } from "vue-router";
// import Avenger from "./pages/Avenger"
// import Calander from "./pages/Calander"
// import Slider from "./pages/Slider"

const routes =[
    // {path:"/",component:Avenger},
    // {path:"/marvel-heros",component:Avenger},
    // {path:"/calander",component:Calander},
    // {path:"/slider",component:Slider}
]
const router = createRouter({
  history: createWebHistory(),
  routes,
});
export default router