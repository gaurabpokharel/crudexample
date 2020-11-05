module.exports = {
  future: {
    // removeDeprecatedGapUtilities: true,
    // purgeLayersByDefault: true,
  },
  purge: [],
  theme: {
    extend: {
      fontFamily:{
      nunito:['Nunito']
      },
      colors:{
       
      },
      spacing:{
        66: "20rem",
        68: "25rem",
        70: "30rem",
        72: "35rem",
        74: "40rem",
        76: "45rem",
        78: "50rem",
        80: "55rem",
        82: "60rem",
        84: "65rem",
        86: "70rem",
      }
    },

  },
  variants: {},
  plugins: [],
  experimental: {
    applyComplexClasses: true,
    uniformColorPalette: true,
    extendedSpacingScale: true,
    defaultLineHeights: true,
  },
}
